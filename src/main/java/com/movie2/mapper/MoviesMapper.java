package com.movie2.mapper;

import com.movie2.bean.Movies;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author CL
 * @since 2022-05-31
 */
public interface MoviesMapper extends BaseMapper<Movies> {
    List<Movies> findByName(String name);
    List<Movies> findAllMovies();
}
