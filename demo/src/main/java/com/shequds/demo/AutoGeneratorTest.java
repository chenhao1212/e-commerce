package com.shequds.demo;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class AutoGeneratorTest {

    //考试的时候记得修改你自己的数据库名称
    private static final String DATABASENAME="dian_shang";

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        //1.创建代码生成器对象
        AutoGenerator mpg =new AutoGenerator();

        //1.1对象全局设置
        GlobalConfig gc = new GlobalConfig();
        //设置作者
        gc.setAuthor("zyb");
        //设置返回的sql片段的字段
        gc.setBaseColumnList(true);
        //设置返回resultMap
        gc.setBaseResultMap(true);
        //代码生成后，是否打开代码
        gc.setOpen(false);
        //设置输出到哪里
        gc.setOutputDir(System.getProperty("user.dir")+"/src/main/java/");

        //设置全局配置
        mpg.setGlobalConfig(gc);

        //1.2 数据源设置  数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        //设置驱动类
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        //设置url地址,考虑数据库的名称（修改操作）
        dsc.setUrl("jdbc:mysql://10.39.39.25:3306/"+DATABASENAME+"?characterEncoding=UTF8&userSSL=false&serverTimezone=GMT%2B8");
        //设置用户名
        dsc.setUsername("root");
        //设置密码
        dsc.setPassword("xuda666");
        //设置数据源配置
        mpg.setDataSource(dsc);


        //1.3 对象包设置
        PackageConfig pc = new PackageConfig();
        //当前类的包可以作为包名
        pc.setParent(AutoGeneratorTest.class.getPackage().getName());
        //设置配置文件
        pc.setXml("mappers");

        //设置包名
        mpg.setPackageInfo(pc);

        //1.4生成策略配置
        StrategyConfig sc = new StrategyConfig();
        //指定生成的表名，数组  //指定生成表
        sc.setInclude("user"); //没有的话，就全部生成
        //sc.setExclude() 排除表
        //开启 前后端的时候打开
        sc.setRestControllerStyle(true);
        //去掉指定前缀
        //sc.setTablePrefix("cancer_");

        //驼峰命名
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);

        //开启字段注解
        sc.setEntityTableFieldAnnotationEnable(true);

        //实体Bean采用lombok的注解
        sc.setEntityLombokModel(true);


        //设置生成策略
        mpg.setStrategy(sc);

        //2. 执行生成
        mpg.execute();
    }
}

