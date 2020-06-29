package com.softeem.bean.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("adminId <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adminId not between", value1, value2, "adminId");
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

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUserContentIsNull() {
            addCriterion("userContent is null");
            return (Criteria) this;
        }

        public Criteria andUserContentIsNotNull() {
            addCriterion("userContent is not null");
            return (Criteria) this;
        }

        public Criteria andUserContentEqualTo(String value) {
            addCriterion("userContent =", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotEqualTo(String value) {
            addCriterion("userContent <>", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentGreaterThan(String value) {
            addCriterion("userContent >", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentGreaterThanOrEqualTo(String value) {
            addCriterion("userContent >=", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLessThan(String value) {
            addCriterion("userContent <", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLessThanOrEqualTo(String value) {
            addCriterion("userContent <=", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLike(String value) {
            addCriterion("userContent like", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotLike(String value) {
            addCriterion("userContent not like", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentIn(List<String> values) {
            addCriterion("userContent in", values, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotIn(List<String> values) {
            addCriterion("userContent not in", values, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentBetween(String value1, String value2) {
            addCriterion("userContent between", value1, value2, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotBetween(String value1, String value2) {
            addCriterion("userContent not between", value1, value2, "userContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentIsNull() {
            addCriterion("adminContent is null");
            return (Criteria) this;
        }

        public Criteria andAdminContentIsNotNull() {
            addCriterion("adminContent is not null");
            return (Criteria) this;
        }

        public Criteria andAdminContentEqualTo(String value) {
            addCriterion("adminContent =", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentNotEqualTo(String value) {
            addCriterion("adminContent <>", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentGreaterThan(String value) {
            addCriterion("adminContent >", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentGreaterThanOrEqualTo(String value) {
            addCriterion("adminContent >=", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentLessThan(String value) {
            addCriterion("adminContent <", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentLessThanOrEqualTo(String value) {
            addCriterion("adminContent <=", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentLike(String value) {
            addCriterion("adminContent like", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentNotLike(String value) {
            addCriterion("adminContent not like", value, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentIn(List<String> values) {
            addCriterion("adminContent in", values, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentNotIn(List<String> values) {
            addCriterion("adminContent not in", values, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentBetween(String value1, String value2) {
            addCriterion("adminContent between", value1, value2, "adminContent");
            return (Criteria) this;
        }

        public Criteria andAdminContentNotBetween(String value1, String value2) {
            addCriterion("adminContent not between", value1, value2, "adminContent");
            return (Criteria) this;
        }

        public Criteria andUserNewIsNull() {
            addCriterion("userNew is null");
            return (Criteria) this;
        }

        public Criteria andUserNewIsNotNull() {
            addCriterion("userNew is not null");
            return (Criteria) this;
        }

        public Criteria andUserNewEqualTo(Integer value) {
            addCriterion("userNew =", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewNotEqualTo(Integer value) {
            addCriterion("userNew <>", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewGreaterThan(Integer value) {
            addCriterion("userNew >", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("userNew >=", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewLessThan(Integer value) {
            addCriterion("userNew <", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewLessThanOrEqualTo(Integer value) {
            addCriterion("userNew <=", value, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewIn(List<Integer> values) {
            addCriterion("userNew in", values, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewNotIn(List<Integer> values) {
            addCriterion("userNew not in", values, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewBetween(Integer value1, Integer value2) {
            addCriterion("userNew between", value1, value2, "userNew");
            return (Criteria) this;
        }

        public Criteria andUserNewNotBetween(Integer value1, Integer value2) {
            addCriterion("userNew not between", value1, value2, "userNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewIsNull() {
            addCriterion("adminNew is null");
            return (Criteria) this;
        }

        public Criteria andAdminNewIsNotNull() {
            addCriterion("adminNew is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNewEqualTo(Integer value) {
            addCriterion("adminNew =", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewNotEqualTo(Integer value) {
            addCriterion("adminNew <>", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewGreaterThan(Integer value) {
            addCriterion("adminNew >", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminNew >=", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewLessThan(Integer value) {
            addCriterion("adminNew <", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewLessThanOrEqualTo(Integer value) {
            addCriterion("adminNew <=", value, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewIn(List<Integer> values) {
            addCriterion("adminNew in", values, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewNotIn(List<Integer> values) {
            addCriterion("adminNew not in", values, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewBetween(Integer value1, Integer value2) {
            addCriterion("adminNew between", value1, value2, "adminNew");
            return (Criteria) this;
        }

        public Criteria andAdminNewNotBetween(Integer value1, Integer value2) {
            addCriterion("adminNew not between", value1, value2, "adminNew");
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