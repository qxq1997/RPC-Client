package client;

import interfaces.HelloService;
import proxy.RpcClientProxy;
import entity.HelloObject;

/**
 * @author by QXQ
 * @date 2021/2/28.
 */
public class ClientTest {
    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy(9000, "127.0.0.1");
        HelloService service = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject();
        object.setGreeting("Niubi");
        String ans = service.hello(object);
        System.out.println("client收到返回值为" + ans.toString());
    }

}
