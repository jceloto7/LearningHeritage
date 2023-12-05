package com.jceloto7.learning_heritage;

import com.jceloto7.learning_heritage.service.GetRouterIPService;
import com.jceloto7.learning_heritage.util.InputUtil;

public class Bootstrap {
    public static InputUtil inputUtil;
    public static GetRouterIPService getRouterIPService;

    public static void start(){
        inputUtil = new InputUtil();
        getRouterIPService = new GetRouterIPService();
    }

}
