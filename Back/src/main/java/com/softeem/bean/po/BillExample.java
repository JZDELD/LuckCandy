package com.softeem.bean.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andNowIsNull() {
            addCriterion("now is null");
            return (Criteria) this;
        }

        public Criteria andNowIsNotNull() {
            addCriterion("now is not null");
            return (Criteria) this;
        }

        public Criteria andNowEqualTo(Integer value) {
            addCriterion("now =", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotEqualTo(Integer value) {
            addCriterion("now <>", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowGreaterThan(Integer value) {
            addCriterion("now >", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowGreaterThanOrEqualTo(Integer value) {
            addCriterion("now >=", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowLessThan(Integer value) {
            addCriterion("now <", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowLessThanOrEqualTo(Integer value) {
            addCriterion("now <=", value, "now");
            return (Criteria) this;
        }

        public Criteria andNowIn(List<Integer> values) {
            addCriterion("now in", values, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotIn(List<Integer> values) {
            addCriterion("now not in", values, "now");
            return (Criteria) this;
        }

        public Criteria andNowBetween(Integer value1, Integer value2) {
            addCriterion("now between", value1, value2, "now");
            return (Criteria) this;
        }

        public Criteria andNowNotBetween(Integer value1, Integer value2) {
            addCriterion("now not between", value1, value2, "now");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("paymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("paymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("paymentTime =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("paymentTime <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("paymentTime >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paymentTime >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("paymentTime <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("paymentTime <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("paymentTime in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("paymentTime not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("paymentTime between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("paymentTime not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andBillStartIsNull() {
            addCriterion("billStart is null");
            return (Criteria) this;
        }

        public Criteria andBillStartIsNotNull() {
            addCriterion("billStart is not null");
            return (Criteria) this;
        }

        public Criteria andBillStartEqualTo(Date value) {
            addCriterionForJDBCDate("billStart =", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("billStart <>", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartGreaterThan(Date value) {
            addCriterionForJDBCDate("billStart >", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billStart >=", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartLessThan(Date value) {
            addCriterionForJDBCDate("billStart <", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billStart <=", value, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartIn(List<Date> values) {
            addCriterionForJDBCDate("billStart in", values, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("billStart not in", values, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billStart between", value1, value2, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billStart not between", value1, value2, "billStart");
            return (Criteria) this;
        }

        public Criteria andBillEndIsNull() {
            addCriterion("billEnd is null");
            return (Criteria) this;
        }

        public Criteria andBillEndIsNotNull() {
            addCriterion("billEnd is not null");
            return (Criteria) this;
        }

        public Criteria andBillEndEqualTo(Date value) {
            addCriterionForJDBCDate("billEnd =", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("billEnd <>", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndGreaterThan(Date value) {
            addCriterionForJDBCDate("billEnd >", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billEnd >=", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndLessThan(Date value) {
            addCriterionForJDBCDate("billEnd <", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billEnd <=", value, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndIn(List<Date> values) {
            addCriterionForJDBCDate("billEnd in", values, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("billEnd not in", values, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billEnd between", value1, value2, "billEnd");
            return (Criteria) this;
        }

        public Criteria andBillEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billEnd not between", value1, value2, "billEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndIsNull() {
            addCriterion("payEnd is null");
            return (Criteria) this;
        }

        public Criteria andPayEndIsNotNull() {
            addCriterion("payEnd is not null");
            return (Criteria) this;
        }

        public Criteria andPayEndEqualTo(Date value) {
            addCriterionForJDBCDate("payEnd =", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("payEnd <>", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndGreaterThan(Date value) {
            addCriterionForJDBCDate("payEnd >", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payEnd >=", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndLessThan(Date value) {
            addCriterionForJDBCDate("payEnd <", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("payEnd <=", value, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndIn(List<Date> values) {
            addCriterionForJDBCDate("payEnd in", values, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("payEnd not in", values, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payEnd between", value1, value2, "payEnd");
            return (Criteria) this;
        }

        public Criteria andPayEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("payEnd not between", value1, value2, "payEnd");
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