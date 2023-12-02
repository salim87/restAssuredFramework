package test;

import com.complexJson.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComplexPojoGenerator {

    public static JsonRoot pojo(){
        List<Curve> curvesList = new ArrayList<Curve>();
        Curve curve = new Curve();
        curve.setZemaCurveId("123");
        curvesList.add(curve);

        Curves curves =new Curves();
        curves.setCurve(curvesList);

        Request request = new Request();
        request.setQuoteFromDate("1234")
                .setQuoteToDate("345")
                .setCurves(curves)
                .setUpdateOnly("3421")
                .setInsertedOrUpdated("");

        JsonRoot root = new JsonRoot();
        root.setRequest(request);

        return root;
       /* return root.setRequest(request.setQuoteFromDate("2345")
                .setQuoteToDate("1234")
                .setCurves(curves.setCurve(curvesList))
                .setUpdateOnly("3456").setInsertedOrUpdated("")); */
    }

    public static Root root(){

        Root rt= new Root();
        rt.setId(234).setInterperoperation("IR").setInterperoperation("2023-7-2:00-00-00");
        return rt;
    }
}
