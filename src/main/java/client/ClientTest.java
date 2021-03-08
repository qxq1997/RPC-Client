package client;

import common.entity.HelloObject;
import interfaces.HelloService;
import transport.RpcClient;
import transport.RpcClientProxy;
import transport.netty.NettyRpcClient;

/**
 * @author by QXQ
 * @date 2021/2/28.
 */
public class ClientTest {
    private HelloService service;

    public static void main(String[] args) {
        RpcClient client = new NettyRpcClient();
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService service = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject();
        object.setGreeting("Niubi");
        String ans = service.hello(object);
        System.out.println("client收到返回值为" + ans.toString());
    }

}
