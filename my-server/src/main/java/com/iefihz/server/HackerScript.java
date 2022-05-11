package com.iefihz.server;

import java.util.concurrent.TimeUnit;

/**
 * HackerScript
 *
 * @author He Zhifei
 * @date 2021/12/24 22:30
 */
public class HackerScript {

    static {
        run();
    }

    private static void run() {
        for (;;) {
            System.out.println("++++++++++++ 齐天大圣到此一游 ++++++++++++");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
