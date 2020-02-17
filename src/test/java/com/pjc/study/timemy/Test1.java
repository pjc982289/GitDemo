package com.pjc.study.timemy;

import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;


/**
 * @program: javales
 * @description: ceshi
 * @author: pjc
 * @create: 2019-12-27 09:55
 **/
public class Test1 {


    private static void userRechargeListSort(List<VisitorVO> list) {
        Collections.sort(list, new Comparator<VisitorVO>() {
            @Override
            public int compare(VisitorVO o1, VisitorVO o2) {
//                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try {
                    //format.parse(
                    LocalDateTime dt1 = o1.getVisitTime();
                    LocalDateTime dt2 = o2.getVisitTime();
                    if (dt1.isAfter(dt2)) {
                        return -1;
                    } else if (dt1.isBefore(dt2)) {
                        return 1;
                    } else {
                        return 0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
    }

    @Test
    public void queryVisitorNewMessage() {

        //todo 返回一个list
//        List<VisitorVO> visitorVOS = userRemoteService.getUserInfoByUserUuid;
        VisitorVO v1 = new VisitorVO();
        VisitorVO v2 = new VisitorVO();
        VisitorVO v3 = new VisitorVO();
        v2.setVisitTime(LocalDateTime.now());
        v1.setVisitTime(LocalDateTime.now().minusDays(2));
        v3.setVisitTime(LocalDateTime.now().minusDays(1));
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.format(d);
        System.out.println(sdf.format(d)+"****************");

        List<VisitorVO> visitorVOS = new ArrayList<>();

        visitorVOS.add(v1);
        visitorVOS.add(v2);
        visitorVOS.add(v3);
        System.out.println("排序前："+visitorVOS);
        userRechargeListSort(visitorVOS);

        System.out.println("排序后："+visitorVOS);

    }

}


