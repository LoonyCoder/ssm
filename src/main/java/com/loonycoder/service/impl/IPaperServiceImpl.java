package com.loonycoder.service.impl;

import com.loonycoder.dao.IPaperDao;
import com.loonycoder.pojo.Paper;
import com.loonycoder.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPaperServiceImpl implements IPaperService {

    @Autowired
    private IPaperDao paperDao;


    @Override
    public int addPaper(Paper paper) {

        return paperDao.addPaper(paper);

    }


    @Override
    public int deletePaperById(long id) {

        return paperDao.deletePaperById(id);

    }


    @Override

    public int updatePaper(Paper paper) {

        return paperDao.updatePaper(paper);

    }


    @Override

    public Paper queryById(long id) {

        return paperDao.queryById(id);

    }


    @Override

    public List<Paper> queryAllPaper() {

        return paperDao.queryAllPaper();

    }


}

