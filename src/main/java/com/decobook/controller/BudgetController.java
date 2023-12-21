package com.decobook.controller;

import com.decobook.model.dto.Budget;
import com.decobook.model.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BudgetController {

    @Autowired private BudgetService bService;

    //등록
    @PostMapping("/budget")
    public ResponseEntity<?> registBudget(Budget budget){

        int res = bService.registBudget(budget);

        //실패
        if(res == 0){
            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
        }

        //성공
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    //수정
    @PutMapping("/budget")
    public ResponseEntity<?> updateBudget(Budget budget){

        int res = bService.updateBudget(budget);

        //실패
        if(res == 0){
            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
        }

        //성공
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    //삭제
    @DeleteMapping("/budget")
    public ResponseEntity<?> deleteBudget(int budget_id){

        int res = bService.deleteBudget(budget_id);

        //실패
        if(res == 0){
            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
        }

        //성공
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    //전체목록
    @GetMapping("/budget")
    public ResponseEntity<?> selectBudgetAll(){

        List<Budget> list = bService.selectBudgetAll();

        //리스트 없음
        if(list == null || list.size() == 0){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        //있음
        return new ResponseEntity<List<Budget>>(list,HttpStatus.OK);

    }

    //디테일
    @GetMapping("/budget/{budget_id}")
    public ResponseEntity<?> selectBudgetOne(int budget_id){

        Budget budget = bService.selectBudgetOne(budget_id);

        //가계부 없음
        if(budget == null){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        //있음
        return new ResponseEntity<Budget>(budget,HttpStatus.OK);

    }

    //현재 달의 총 수입
    @GetMapping("/budget/income")
    public ResponseEntity<?> selectBudgetIncome(int category){

        List<Budget> list = bService.selectBudgetIncome(category);

        if(list == null || list.size() == 0){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Budget>>(list,HttpStatus.OK);

    }

    //현재 달의 총 지출
    @GetMapping("/budget/expenditure")
    public ResponseEntity<?> selectBudgetExpenditure(int category){

        List<Budget> list = bService.selectBudgetExpenditure(category);

        if(list == null || list.size() == 0){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Budget>>(list,HttpStatus.OK);

    }

    //월 별 가계부
    @GetMapping("/budget/month/{budget_date}")
    public ResponseEntity<?> selectBudgetByMonth(String budget_date){

        List<Budget> list = bService.selectBudgetByMonth(budget_date);

        if(list == null || list.size() == 0){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Budget>>(list,HttpStatus.OK);
    }

    //일 별 가계부
    @GetMapping("/budget/day/{budget_date}")
    public ResponseEntity<?> selectBudgetByDay(String budget_date){

        List<Budget> list = bService.selectBudgetByDay(budget_date);

        if(list == null || list.size() == 0){
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Budget>>(list,HttpStatus.OK);
    }


}
