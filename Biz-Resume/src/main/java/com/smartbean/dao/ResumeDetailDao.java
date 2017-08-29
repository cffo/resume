package com.smartbean.dao;

import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ResumeDetailDao {
    ResumeDetail save(ResumeDetail resumeDetail);

    List<ResumeDetail> save(List<ResumeDetail> resumeDetails);
}