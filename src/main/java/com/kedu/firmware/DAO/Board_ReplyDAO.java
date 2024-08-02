package com.kedu.firmware.DAO;

import com.kedu.firmware.DTO.Board_ReplyDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Board_ReplyDAO {

    @Autowired
    private SqlSession mybatis;

    public void insert(Board_ReplyDTO dto) {
        mybatis.insert("reply.insert", dto);
    }

    public List<Board_ReplyDTO> selectAll(int boardSeq) {
        return mybatis.selectList("reply.selectAll", boardSeq);
    }
}


