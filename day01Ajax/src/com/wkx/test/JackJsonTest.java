package com.wkx.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wkx.domain.Person;
import com.wkx.domain.Person1;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class JackJsonTest {

    @Test
    public void JackSon() throws IOException {

        //1、创建Person对象
        Person p = new Person();
        p.setUsername("张三");
        p.setAge(23);
        p.setGender("男");


        //2、创建Jackson核心对象 ObjectMapper
        //创建Json解析器对象
        ObjectMapper mapper = new ObjectMapper();

        //3、转换
        /**
         * 转换方法：
         *  writeValue(参数1,obj)
         *      参数1：
         *          File:将obj对象转换为json字符串，并保存到文件中
         *          Writer:将obj对象转换为json字符串，将json数据填充到字符输出流中
         *          OutputStream:将obj对象转换为json字符串，将json数据填充到字节输出流中
         *  writeValueAsString:将Json对象转换为字符串
         */
        String json = mapper.writeValueAsString(p);
        System.out.println(json);

        //mapper.writeValue(new File("d://a.txt"),p);
        //mapper.writeValue(new FileWriter("d://a.txt"),p);

    }

    @Test
    public void jsonTest() throws Exception{
        Person1 p = new Person1();
        p.setUsername("李四");
        p.setAge(24);
        p.setGender("男");
        p.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);
    }
}
