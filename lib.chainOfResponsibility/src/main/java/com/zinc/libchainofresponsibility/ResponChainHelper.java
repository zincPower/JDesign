package com.zinc.libchainofresponsibility;

import com.zinc.libchainofresponsibility.handler.CEOHandler;
import com.zinc.libchainofresponsibility.handler.CTOHandler;
import com.zinc.libchainofresponsibility.handler.Handler;
import com.zinc.libchainofresponsibility.handler.ManagerHandler;
import com.zinc.libchainofresponsibility.handler.TeamLeaderHandler;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class ResponChainHelper {

    public static Handler getResChain() {

        Handler ctoHandler = new CTOHandler();
        Handler managerHandler = new ManagerHandler();
        Handler teamLeaderHandler = new TeamLeaderHandler();
        Handler ceoHandler = new CEOHandler();

        teamLeaderHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(ctoHandler);
        ctoHandler.setNextHandler(ceoHandler);

        return teamLeaderHandler;

    }

}
