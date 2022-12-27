package com.jpadatatest.demo;

import com.jpadatatest.demo.entity.*;
import com.jpadatatest.demo.repository.ContractRepository;
import com.jpadatatest.demo.repository.EmployeeRepository;
import com.jpadatatest.demo.service.GiftService;
import com.jpadatatest.demo.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ProductService productService;
    @Autowired
    private GiftService giftService ;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ContractRepository contractRepository;

    @Test
    void contextLoads() {
    }
    @Test
    void addProduct(){
//        BookOld bookOld1 = new BookOld();
//        bookOld1.setPrice(30000L);
//        bookOld1.setIsbn("kk");
//        bookOld1.setDispatch("post");
//        bookOld1.setCreateAt( new Date());
//        bookOld1.setUpdateAt( new Date());
        BookDigital bookDigital = new BookDigital();
        bookDigital.setCreateAt(new Date());
        bookDigital.setDownloadable(new Date());
        bookDigital.setUpdateAt(new Date());
        bookDigital.setUrl("kia@bala.com");
        bookDigital.setIsDeleted(false);
        productService.addProduct(bookDigital);
    }
//    @Test
//    void addGift(){
//        ChirsmathGift chirsmathGift = new ChirsmathGift();
//        chirsmathGift.setName("kolah");
//        chirsmathGift.setPrice(2000L);
//        chirsmathGift.setIsInStock(true);
//        chirsmathGift.setIsEventBase(true);
//        chirsmathGift.setCreateAt(new Date());
//        giftService.addGift(chirsmathGift);
//    }
    @Test
    void addEmployee(){
        EmployeeTechnical emp = new EmployeeTechnical();
        emp.setLevel("high");
        emp.setSalary(20000L);
        emp.setName("kia");
        emp.setFamily("shamaei");
        emp.setPart("it");
        employeeRepository.save(emp);

    }
    @Test
    void addContract(){
        ShilaContract contract  = new ShilaContract();
        contract.setPercent(20L);
        contract.setExpTime(LocalDate.now());
        contract.setName("shilaFirstYear");
        contractRepository.save(contract);
    }


}
