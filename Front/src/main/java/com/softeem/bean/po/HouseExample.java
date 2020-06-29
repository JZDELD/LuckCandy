package com.softeem.bean.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("houseType is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("houseType is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("houseType =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("houseType <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("houseType >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("houseType >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("houseType <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("houseType <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("houseType like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("houseType not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("houseType in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("houseType not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("houseType between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("houseType not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIsNull() {
            addCriterion("landlordId is null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIsNotNull() {
            addCriterion("landlordId is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdEqualTo(Integer value) {
            addCriterion("landlordId =", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotEqualTo(Integer value) {
            addCriterion("landlordId <>", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThan(Integer value) {
            addCriterion("landlordId >", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("landlordId >=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThan(Integer value) {
            addCriterion("landlordId <", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThanOrEqualTo(Integer value) {
            addCriterion("landlordId <=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIn(List<Integer> values) {
            addCriterion("landlordId in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotIn(List<Integer> values) {
            addCriterion("landlordId not in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdBetween(Integer value1, Integer value2) {
            addCriterion("landlordId between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("landlordId not between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(Integer value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Integer value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Integer value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Integer value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Integer value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Integer> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Integer> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Integer value1, Integer value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Integer value1, Integer value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningIsNull() {
            addCriterion("degreeOfGreening is null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningIsNotNull() {
            addCriterion("degreeOfGreening is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningEqualTo(Integer value) {
            addCriterion("degreeOfGreening =", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningNotEqualTo(Integer value) {
            addCriterion("degreeOfGreening <>", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningGreaterThan(Integer value) {
            addCriterion("degreeOfGreening >", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningGreaterThanOrEqualTo(Integer value) {
            addCriterion("degreeOfGreening >=", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningLessThan(Integer value) {
            addCriterion("degreeOfGreening <", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningLessThanOrEqualTo(Integer value) {
            addCriterion("degreeOfGreening <=", value, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningIn(List<Integer> values) {
            addCriterion("degreeOfGreening in", values, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningNotIn(List<Integer> values) {
            addCriterion("degreeOfGreening not in", values, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningBetween(Integer value1, Integer value2) {
            addCriterion("degreeOfGreening between", value1, value2, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andDegreeOfGreeningNotBetween(Integer value1, Integer value2) {
            addCriterion("degreeOfGreening not between", value1, value2, "degreeOfGreening");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceIsNull() {
            addCriterion("monthlyPrice is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceIsNotNull() {
            addCriterion("monthlyPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceEqualTo(Double value) {
            addCriterion("monthlyPrice =", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceNotEqualTo(Double value) {
            addCriterion("monthlyPrice <>", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceGreaterThan(Double value) {
            addCriterion("monthlyPrice >", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("monthlyPrice >=", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceLessThan(Double value) {
            addCriterion("monthlyPrice <", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceLessThanOrEqualTo(Double value) {
            addCriterion("monthlyPrice <=", value, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceIn(List<Double> values) {
            addCriterion("monthlyPrice in", values, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceNotIn(List<Double> values) {
            addCriterion("monthlyPrice not in", values, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceBetween(Double value1, Double value2) {
            addCriterion("monthlyPrice between", value1, value2, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andMonthlyPriceNotBetween(Double value1, Double value2) {
            addCriterion("monthlyPrice not between", value1, value2, "monthlyPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceIsNull() {
            addCriterion("seasonPrice is null");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceIsNotNull() {
            addCriterion("seasonPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceEqualTo(Double value) {
            addCriterion("seasonPrice =", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceNotEqualTo(Double value) {
            addCriterion("seasonPrice <>", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceGreaterThan(Double value) {
            addCriterion("seasonPrice >", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("seasonPrice >=", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceLessThan(Double value) {
            addCriterion("seasonPrice <", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceLessThanOrEqualTo(Double value) {
            addCriterion("seasonPrice <=", value, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceIn(List<Double> values) {
            addCriterion("seasonPrice in", values, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceNotIn(List<Double> values) {
            addCriterion("seasonPrice not in", values, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceBetween(Double value1, Double value2) {
            addCriterion("seasonPrice between", value1, value2, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andSeasonPriceNotBetween(Double value1, Double value2) {
            addCriterion("seasonPrice not between", value1, value2, "seasonPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceIsNull() {
            addCriterion("halfYearPrice is null");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceIsNotNull() {
            addCriterion("halfYearPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceEqualTo(Double value) {
            addCriterion("halfYearPrice =", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceNotEqualTo(Double value) {
            addCriterion("halfYearPrice <>", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceGreaterThan(Double value) {
            addCriterion("halfYearPrice >", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("halfYearPrice >=", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceLessThan(Double value) {
            addCriterion("halfYearPrice <", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceLessThanOrEqualTo(Double value) {
            addCriterion("halfYearPrice <=", value, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceIn(List<Double> values) {
            addCriterion("halfYearPrice in", values, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceNotIn(List<Double> values) {
            addCriterion("halfYearPrice not in", values, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceBetween(Double value1, Double value2) {
            addCriterion("halfYearPrice between", value1, value2, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andHalfYearPriceNotBetween(Double value1, Double value2) {
            addCriterion("halfYearPrice not between", value1, value2, "halfYearPrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("servicePrice is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("servicePrice is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(Double value) {
            addCriterion("servicePrice =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(Double value) {
            addCriterion("servicePrice <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(Double value) {
            addCriterion("servicePrice >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("servicePrice >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(Double value) {
            addCriterion("servicePrice <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(Double value) {
            addCriterion("servicePrice <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<Double> values) {
            addCriterion("servicePrice in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<Double> values) {
            addCriterion("servicePrice not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(Double value1, Double value2) {
            addCriterion("servicePrice between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(Double value1, Double value2) {
            addCriterion("servicePrice not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Double value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Double value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Double value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Double value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Double value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Double> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Double> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Double value1, Double value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Double value1, Double value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("cityId =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("cityId <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("cityId >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityId >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("cityId <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("cityId <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("cityId in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("cityId not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("cityId between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cityId not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("regionId is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("regionId is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("regionId =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("regionId <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("regionId >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regionId >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("regionId <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("regionId <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("regionId in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("regionId not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("regionId between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regionId not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNull() {
            addCriterion("salesmanId is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNotNull() {
            addCriterion("salesmanId is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdEqualTo(Integer value) {
            addCriterion("salesmanId =", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotEqualTo(Integer value) {
            addCriterion("salesmanId <>", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThan(Integer value) {
            addCriterion("salesmanId >", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesmanId >=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThan(Integer value) {
            addCriterion("salesmanId <", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesmanId <=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIn(List<Integer> values) {
            addCriterion("salesmanId in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotIn(List<Integer> values) {
            addCriterion("salesmanId not in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdBetween(Integer value1, Integer value2) {
            addCriterion("salesmanId between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesmanId not between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdIsNull() {
            addCriterion("configurationId is null");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdIsNotNull() {
            addCriterion("configurationId is not null");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdEqualTo(Integer value) {
            addCriterion("configurationId =", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdNotEqualTo(Integer value) {
            addCriterion("configurationId <>", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdGreaterThan(Integer value) {
            addCriterion("configurationId >", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("configurationId >=", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdLessThan(Integer value) {
            addCriterion("configurationId <", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdLessThanOrEqualTo(Integer value) {
            addCriterion("configurationId <=", value, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdIn(List<Integer> values) {
            addCriterion("configurationId in", values, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdNotIn(List<Integer> values) {
            addCriterion("configurationId not in", values, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdBetween(Integer value1, Integer value2) {
            addCriterion("configurationId between", value1, value2, "configurationId");
            return (Criteria) this;
        }

        public Criteria andConfigurationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("configurationId not between", value1, value2, "configurationId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdIsNull() {
            addCriterion("subwayId is null");
            return (Criteria) this;
        }

        public Criteria andSubwayIdIsNotNull() {
            addCriterion("subwayId is not null");
            return (Criteria) this;
        }

        public Criteria andSubwayIdEqualTo(Integer value) {
            addCriterion("subwayId =", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdNotEqualTo(Integer value) {
            addCriterion("subwayId <>", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdGreaterThan(Integer value) {
            addCriterion("subwayId >", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subwayId >=", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdLessThan(Integer value) {
            addCriterion("subwayId <", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdLessThanOrEqualTo(Integer value) {
            addCriterion("subwayId <=", value, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdIn(List<Integer> values) {
            addCriterion("subwayId in", values, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdNotIn(List<Integer> values) {
            addCriterion("subwayId not in", values, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdBetween(Integer value1, Integer value2) {
            addCriterion("subwayId between", value1, value2, "subwayId");
            return (Criteria) this;
        }

        public Criteria andSubwayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subwayId not between", value1, value2, "subwayId");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNull() {
            addCriterion("communityName is null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNotNull() {
            addCriterion("communityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameEqualTo(String value) {
            addCriterion("communityName =", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotEqualTo(String value) {
            addCriterion("communityName <>", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThan(String value) {
            addCriterion("communityName >", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThanOrEqualTo(String value) {
            addCriterion("communityName >=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThan(String value) {
            addCriterion("communityName <", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThanOrEqualTo(String value) {
            addCriterion("communityName <=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLike(String value) {
            addCriterion("communityName like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotLike(String value) {
            addCriterion("communityName not like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIn(List<String> values) {
            addCriterion("communityName in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotIn(List<String> values) {
            addCriterion("communityName not in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameBetween(String value1, String value2) {
            addCriterion("communityName between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotBetween(String value1, String value2) {
            addCriterion("communityName not between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameIsNull() {
            addCriterion("businessCircleName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameIsNotNull() {
            addCriterion("businessCircleName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameEqualTo(String value) {
            addCriterion("businessCircleName =", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameNotEqualTo(String value) {
            addCriterion("businessCircleName <>", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameGreaterThan(String value) {
            addCriterion("businessCircleName >", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("businessCircleName >=", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameLessThan(String value) {
            addCriterion("businessCircleName <", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameLessThanOrEqualTo(String value) {
            addCriterion("businessCircleName <=", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameLike(String value) {
            addCriterion("businessCircleName like", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameNotLike(String value) {
            addCriterion("businessCircleName not like", value, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameIn(List<String> values) {
            addCriterion("businessCircleName in", values, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameNotIn(List<String> values) {
            addCriterion("businessCircleName not in", values, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameBetween(String value1, String value2) {
            addCriterion("businessCircleName between", value1, value2, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleNameNotBetween(String value1, String value2) {
            addCriterion("businessCircleName not between", value1, value2, "businessCircleName");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNull() {
            addCriterion("totalFloor is null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIsNotNull() {
            addCriterion("totalFloor is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFloorEqualTo(Integer value) {
            addCriterion("totalFloor =", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotEqualTo(Integer value) {
            addCriterion("totalFloor <>", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThan(Integer value) {
            addCriterion("totalFloor >", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalFloor >=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThan(Integer value) {
            addCriterion("totalFloor <", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorLessThanOrEqualTo(Integer value) {
            addCriterion("totalFloor <=", value, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorIn(List<Integer> values) {
            addCriterion("totalFloor in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotIn(List<Integer> values) {
            addCriterion("totalFloor not in", values, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorBetween(Integer value1, Integer value2) {
            addCriterion("totalFloor between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andTotalFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("totalFloor not between", value1, value2, "totalFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorIsNull() {
            addCriterion("nowFloor is null");
            return (Criteria) this;
        }

        public Criteria andNowFloorIsNotNull() {
            addCriterion("nowFloor is not null");
            return (Criteria) this;
        }

        public Criteria andNowFloorEqualTo(Integer value) {
            addCriterion("nowFloor =", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorNotEqualTo(Integer value) {
            addCriterion("nowFloor <>", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorGreaterThan(Integer value) {
            addCriterion("nowFloor >", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("nowFloor >=", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorLessThan(Integer value) {
            addCriterion("nowFloor <", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorLessThanOrEqualTo(Integer value) {
            addCriterion("nowFloor <=", value, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorIn(List<Integer> values) {
            addCriterion("nowFloor in", values, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorNotIn(List<Integer> values) {
            addCriterion("nowFloor not in", values, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorBetween(Integer value1, Integer value2) {
            addCriterion("nowFloor between", value1, value2, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andNowFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("nowFloor not between", value1, value2, "nowFloor");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNull() {
            addCriterion("collectNum is null");
            return (Criteria) this;
        }

        public Criteria andCollectNumIsNotNull() {
            addCriterion("collectNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNumEqualTo(Integer value) {
            addCriterion("collectNum =", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotEqualTo(Integer value) {
            addCriterion("collectNum <>", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThan(Integer value) {
            addCriterion("collectNum >", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectNum >=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThan(Integer value) {
            addCriterion("collectNum <", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumLessThanOrEqualTo(Integer value) {
            addCriterion("collectNum <=", value, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumIn(List<Integer> values) {
            addCriterion("collectNum in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotIn(List<Integer> values) {
            addCriterion("collectNum not in", values, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumBetween(Integer value1, Integer value2) {
            addCriterion("collectNum between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andCollectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collectNum not between", value1, value2, "collectNum");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}