package com.loonycoder.service;

import com.loonycoder.pojo.Paper;

import java.util.List;

public interface IPaperService {
    int addPaper(Paper paper);


    int deletePaperById(long id);


    int updatePaper(Paper paper);


    Paper queryById(long id);


    List<Paper> queryAllPaper();
}
