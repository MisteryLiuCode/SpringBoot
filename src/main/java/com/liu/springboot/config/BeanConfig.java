package main.java.com.liu.springboot.config;

import com.liu.springboot.bean.Cat;
import com.liu.springboot.bean.Dog;
import com.liu.springboot.bean.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 标识这是一个配置类，等价于配置文件
 */
@Configuration
@Import({Dog.class, Cat.class})
public class BeanConfig {
    /**
     * @Bean,给容器添加组件，把下面配置的配置文件添加到容器中
     * monster01，默认你的方法名为monster01，作为bean的id
     * Monster:注入类型，注入bean的类型是Monster类型
     * new Monster(200,"牛魔王",500,"封魔拳");给类的属性赋值
     * @Bean(name = "monster_name")自定义指定注入的id名称
     * @return
     */
//    @Bean(name = "monster_name")
    @Bean()
    public Monster monster01(){
        return new Monster(200,"牛魔王",500,"封魔拳");
    }
}
