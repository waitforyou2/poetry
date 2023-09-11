package com.baixue.poetry.utils;



import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;

public class Generator {

    //数据库名称
    private static final String DATABASE_NAME = "poetry";

    //数据库账号
    private static final String DATA_SOURCE_USER_NAME  = "root";
    //数据库密码
    private static final String DATA_SOURCE_PASSWORD  = "123456";
    //生成的表
    private static final String[] TABLE_NAMES = new String[]{
            "user",
            "author",
            "content",
            "user_favorite",
            "type"

    };

    // TODO 默认生成entity，需要生成DTO修改此变量
    // 一般情况下要先生成 DTO类 然后修改此参数再生成 PO 类。
    private static final Boolean IS_DTO = false;

    public static void main(String[] args) {
        //代码生成器
        AutoGenerator generator = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();

        gc.setFileOverride(true);//是否覆盖以前文件
        gc.setOutputDir(System.getProperty("user.dir")+"/src/main/java");//生成路径
        gc.setOpen(false);
        gc.setAuthor("bzz");
        gc.setServiceName("%sService");
        gc.setSwagger2(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

        if (IS_DTO) {
            gc.setSwagger2(true);
            gc.setEntityName("%sDTO");
        }
        generator.setGlobalConfig(gc);

        //数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://localhost:3306/"+DATABASE_NAME
                +"?serverTimezone=UTC&useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setPassword(DATA_SOURCE_PASSWORD);
        dsc.setUsername(DATA_SOURCE_USER_NAME);
        generator.setDataSource(dsc);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(DATABASE_NAME);
        pc.setParent("com.baixue");
        pc.setServiceImpl("service.impl");
        pc.setXml("mapper");
        pc.setEntity("model.pojos");
        generator.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(TABLE_NAMES);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        // Boolean类型字段是否移除is前缀处理
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        strategy.setRestControllerStyle(true);

        // 自动填充字段配置
        strategy.setTableFillList(Arrays.asList(
                new TableFill("create_time", FieldFill.INSERT)
        ));

        generator.setStrategy(strategy);


        generator.execute();










    }

}
