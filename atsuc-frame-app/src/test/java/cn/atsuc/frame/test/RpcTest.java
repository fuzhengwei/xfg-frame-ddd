package cn.atsuc.frame.test;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.rpc.service.GenericService;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class RpcTest {

    /**
     * https://cn.dubbo.apache.org/zh-cn/overview/mannual/java-sdk/advanced-features-and-usage/service/generic-reference/
     * @param args
     */
    public static void main(String[] args) {

        ApplicationConfig application = new ApplicationConfig();
        application.setName("atsuc-frame");
        application.setQosEnable(false);

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");
        registry.setRegister(false);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        reference.setInterface("cn.atsuc.frame.api.IAccountService");
        reference.setVersion("1.0.0");
        reference.setGeneric("true");

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        bootstrap.application(application)
                .registry(registry)
                .reference(reference)
                .start();

        //获取服务，由于是泛化调用，所以获取的一定是GenericService类型
        GenericService genericService = reference.get();

        while (true){
            Object user = genericService.$invoke("queryUserName", new String[]{"java.lang.String"}, new Object[]{"world"});
            System.out.println(user);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
