package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.CountryLanguage;
import com.atguigu.mybatis.entities.CountryLanguageExample;
import com.atguigu.mybatis.entities.CountryLanguageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryLanguageMapper {
    int countByExample(CountryLanguageExample example);

    int deleteByExample(CountryLanguageExample example);

    int deleteByPrimaryKey(CountryLanguageKey key);

    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);

    List<CountryLanguage> selectByExample(CountryLanguageExample example);

    CountryLanguage selectByPrimaryKey(CountryLanguageKey key);

    int updateByExampleSelective(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);

    int updateByExample(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);

    int updateByPrimaryKeySelective(CountryLanguage record);

    int updateByPrimaryKey(CountryLanguage record);
}