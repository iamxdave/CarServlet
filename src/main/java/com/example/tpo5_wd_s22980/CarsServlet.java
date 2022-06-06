package com.example.tpo5_wd_s22980;

import com.example.tpo5_wd_s22980.Helpers.HtmlConverter;
import com.example.tpo5_wd_s22980.Models.Car;
import com.example.tpo5_wd_s22980.Services.CarService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;


@WebServlet(name = "CarsServlet", value = "/cars")
public class CarsServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        String type = request.getParameter("type");

        CarService carService = new CarService();

        ArrayList<Car> selectedCars = carService.getCars();

        if(!Objects.equals(type, "")) {
            selectedCars = (ArrayList<Car>) selectedCars.stream()
                    .filter(car -> Objects.equals(car.type, type))
                    .collect(Collectors.toList());
        }


        writer.println(HtmlConverter.getCarsHtml(selectedCars));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
