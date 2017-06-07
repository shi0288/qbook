package com.mcp.qbook.controller;

import com.mcp.qbook.bean.City;
import com.mcp.qbook.bean.Country;
import com.mcp.qbook.mapper.CityMapper;
import com.mcp.qbook.mapper.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shiqm on 2017/6/5.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private CountryMapper countryMapper;


    @Test
    public void testLogin() throws Exception {

//        System.out.println(cityMapper.list());
//        System.out.println("===============");
//        System.out.println(cityMapper.getCityById(Long.valueOf("1")));
//
//        System.out.println("===============");
//        System.out.println(cityMapper.getCityByIdMap(Long.valueOf("1")).get("name"));
//
//        System.out.println("===============");
//        System.out.println(cityMapper.getCityByIdList().get(0).get("name"));


        City city=new City();
        city.setId(1);
        System.out.println(cityMapper.selectOne(city));


        System.out.println(countryMapper.selectAll());

//        System.out.println(mapperProperties.getIdentity());
//        System.out.println(mapperProperties.getIdentity());
//        System.out.println(mapperProperties.getMappers());
//        System.out.println(mapperProperties.getIdentity());
//        System.out.println(mapperProperties.getIdentity());
//        System.out.println(mapperProperties.getIdentity());






    }



//    public String selectPersonSql() {
//
//
//        return new SQL()
//                .SELECT("P.ID", "A.USERNAME", "A.PASSWORD", "P.FULL_NAME", "D.DEPARTMENT_NAME", "C.COMPANY_NAME")
//                .FROM("PERSON P", "ACCOUNT A")
//                .INNER_JOIN("DEPARTMENT D on D.ID = P.DEPARTMENT_ID", "COMPANY C on D.COMPANY_ID = C.ID")
//                .WHERE("P.ID = A.ID", "P.FULL_NAME like #{name}")
//                .ORDER_BY("P.ID", "P.FULL_NAME")
//                .toString();
//    }

}