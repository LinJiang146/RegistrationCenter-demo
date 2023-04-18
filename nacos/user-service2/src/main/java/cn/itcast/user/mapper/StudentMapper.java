package cn.itcast.user.mapper;



import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface StudentMapper {
    @Select("select English from Student where (name = #{name})")
    String getEnglishByName(@Param("name") String name);
}
