package com.example.demo.controller;


import com.example.demo.entity.Detail;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/detail")
@RequiredArgsConstructor
public class DetailController {
    private static final ArrayList<Detail> details = new ArrayList<>();

    {
        Detail detail1 = new Detail();
        detail1.setName("freeChips_api2_name1");
        detail1.setStockQuant(500);
        detail1.setMinQuant(10);

        List<Detail.Price> prices1 = new ArrayList<>();
        Detail.Price price1_1 = new Detail.Price();
        price1_1.breakQty = 1;
        price1_1.value = 0.1;
        price1_1.currency = "USD";
        prices1.add(price1_1);

        Detail.Price price1_2 = new Detail.Price();
        price1_2.breakQty = 100;
        price1_2.value = 0.09;
        price1_2.currency = "USD";
        prices1.add(price1_2);

        Detail.Price price1_3 = new Detail.Price();
        price1_3.breakQty = 1000;
        price1_3.value = 0.08;
        price1_3.currency = "USD";
        prices1.add(price1_3);

        detail1.setPrices(prices1);
        details.add(detail1);

        // Second detail
        Detail detail2 = new Detail();
        detail2.setName("freeChips_api2_name2");
        detail2.setStockQuant(300);
        detail2.setMinQuant(5);

        List<Detail.Price> prices2 = new ArrayList<>();
        Detail.Price price2_1 = new Detail.Price();
        price2_1.breakQty = 1;
        price2_1.value = 0.2;
        price2_1.currency = "USD";
        prices2.add(price2_1);

        Detail.Price price2_2 = new Detail.Price();
        price2_2.breakQty = 50;
        price2_2.value = 0.18;
        price2_2.currency = "USD";
        prices2.add(price2_2);

        Detail.Price price2_3 = new Detail.Price();
        price2_3.breakQty = 500;
        price2_3.value = 0.15;
        price2_3.currency = "USD";
        prices2.add(price2_3);

        detail2.setPrices(prices2);
        details.add(detail2);

        // Third detail
        Detail detail3 = new Detail();
        detail3.setName("freeChips_api2_name3");
        detail3.setStockQuant(200);
        detail3.setMinQuant(20);

        List<Detail.Price> prices3 = new ArrayList<>();
        Detail.Price price3_1 = new Detail.Price();
        price3_1.breakQty = 1;
        price3_1.value = 0.5;
        price3_1.currency = "USD";
        prices3.add(price3_1);

        Detail.Price price3_2 = new Detail.Price();
        price3_2.breakQty = 30;
        price3_2.value = 0.45;
        price3_2.currency = "USD";
        prices3.add(price3_2);

        Detail.Price price3_3 = new Detail.Price();
        price3_3.breakQty = 300;
        price3_3.value = 0.4;
        price3_3.currency = "USD";
        prices3.add(price3_3);

        detail3.setPrices(prices3);
        details.add(detail3);
    }

    @GetMapping
    public List<Detail> getAll() throws InterruptedException {
        return details;
    }
}
