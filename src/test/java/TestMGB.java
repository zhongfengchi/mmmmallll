//import org.junit.Test;
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.exception.InvalidConfigurationException;
//import org.mybatis.generator.exception.XMLParserException;
//import org.mybatis.generator.internal.DefaultShellCallback;
//
//import java.io.*;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
///**
// * Created by 钟奉池 on 2018/6/10.
// */
//public class TestMGB {
//    @Test
//    public void MBGTest() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
//        List<String> warnings = new ArrayList<>();
//        boolean overwrite = true;
//        File configFile = new File("./src/main/resources/generatorConfig.xml");
//        ConfigurationParser cp = new ConfigurationParser(warnings);
//        Configuration config = cp.parseConfiguration(configFile);
//        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//        myBatisGenerator.generate(null);
//    }
//
//}
