package com.aouty.controller;

import com.aouty.entity.Person;
import com.aouty.entity.PersonExample;
import com.aouty.mapper.PersonMapper;
import com.aouty.service.PersonService;
import com.aouty.util.CalendarUtils;
import com.aouty.util.Result;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Aouty
 * @date 2018-07-15 23:34
 * @description Person的Controller
 */
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonService personService;

    @Autowired
    PersonMapper personMapper;

    //添加一个
    @GetMapping(value = "/add")
    public Result addOne() {
        Person person = new Person();
        person.setName("张含舒");
        person.setDescription("张含舒小仙女");
        person.setCreateTime(CalendarUtils.getDateTimeString());
        person.setModifyTime(CalendarUtils.getDateTimeString());
        personMapper.insertSelective(person);

        return Result.success(personMapper.selectByPrimaryKey(10));
    }

    //查询所有
    @GetMapping(value = "/find")
    public Result findAll() {
        List<Person> list = personMapper.selectByExample(new PersonExample());
        for (Person person : list) {
            System.out.println(person);
        }
        return Result.success(list);
    }

    //查询一个
    @PostMapping(value = "/find/{id}")
    public Result findOne(@PathVariable Integer id) {
        PersonExample example = new PersonExample();
        PersonExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Person> personList = personMapper.selectByExample(example);

        return Result.success(personList.get(0));
    }

}
