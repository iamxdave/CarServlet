package com.example.tpo5_wd_s22980.Helpers;

import com.example.tpo5_wd_s22980.Models.Car;
import java.util.ArrayList;

public class HtmlConverter {
    public static String getIndexHtml() {
        return "<html>\n" +
                "<head>\n" +
                "    <title>Get car data</title>\n" +
                "     <link href=\"Styles/indexStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Put a car type</h1>\n" +
                "    <form action=\"/TPO5_WD_S22980_war_exploded/cars\" method=\"get\">\n" +
                "        Select type: <input type=\"text\" name=\"type\"/>\n" +
                "        <input id=submit type=\"submit\" value=\"Submit\"/>\n" +
                "    </form>\n" +
                "</body>\n" +
                "</html>";
    }

    public static String getCarsHtml(ArrayList<Car> cars) {
        StringBuilder carsTd = new StringBuilder();

        for(Car c : cars) {
            carsTd.append("<tr>");
            carsTd.append("<td>").append(c.brand).append("</td>");
            carsTd.append("<td>").append(c.productionYear).append("</td>");
            carsTd.append("<td>").append(c.type).append("</td>");
            carsTd.append("<td>").append(c.fuelUse).append("</td>");
            carsTd.append("</tr>");
        }

        return "<html>\n" +
                "<head>\n" +
                "    <title>Car data</title>\n" +
                "    <link href=\"Styles/tableStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <table>\n" +
                "        <thead>\n" +
                "            <tr>\n" +
                "               <th>Brand</th>\n" +
                "               <th>Production year</th>\n" +
                "               <th>Type</th>\n" +
                "               <th>Fuel used in l on 100 km</th>\n" +
                "            </tr>\n" +
                "        </thead>\n" +
                "        <tbody>\n" +
                            carsTd +
                "        </tbody>\n" +
                "    </table>\n" +
                "    <br>\n" +
                "    <form action=\"index.html\">" +
                "       <input id=submit type=\"submit\" value=\"Return\"/>" +
                "    </form>" +
                "</body>\n" +
                "</html>";
    }
}
