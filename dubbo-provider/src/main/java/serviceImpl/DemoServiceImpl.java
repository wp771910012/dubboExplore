package serviceImpl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wp.dubbo.api.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wp
 * @date 2018-12-07 14:40
 **/
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
