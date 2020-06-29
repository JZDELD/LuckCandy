package com.softeem.bean.po;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigurationExample() {
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

        public Criteria andBedIsNull() {
            addCriterion("bed is null");
            return (Criteria) this;
        }

        public Criteria andBedIsNotNull() {
            addCriterion("bed is not null");
            return (Criteria) this;
        }

        public Criteria andBedEqualTo(Integer value) {
            addCriterion("bed =", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotEqualTo(Integer value) {
            addCriterion("bed <>", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThan(Integer value) {
            addCriterion("bed >", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed >=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThan(Integer value) {
            addCriterion("bed <", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThanOrEqualTo(Integer value) {
            addCriterion("bed <=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedIn(List<Integer> values) {
            addCriterion("bed in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotIn(List<Integer> values) {
            addCriterion("bed not in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedBetween(Integer value1, Integer value2) {
            addCriterion("bed between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotBetween(Integer value1, Integer value2) {
            addCriterion("bed not between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBathroomIsNull() {
            addCriterion("bathroom is null");
            return (Criteria) this;
        }

        public Criteria andBathroomIsNotNull() {
            addCriterion("bathroom is not null");
            return (Criteria) this;
        }

        public Criteria andBathroomEqualTo(Integer value) {
            addCriterion("bathroom =", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotEqualTo(Integer value) {
            addCriterion("bathroom <>", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomGreaterThan(Integer value) {
            addCriterion("bathroom >", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("bathroom >=", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomLessThan(Integer value) {
            addCriterion("bathroom <", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomLessThanOrEqualTo(Integer value) {
            addCriterion("bathroom <=", value, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomIn(List<Integer> values) {
            addCriterion("bathroom in", values, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotIn(List<Integer> values) {
            addCriterion("bathroom not in", values, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomBetween(Integer value1, Integer value2) {
            addCriterion("bathroom between", value1, value2, "bathroom");
            return (Criteria) this;
        }

        public Criteria andBathroomNotBetween(Integer value1, Integer value2) {
            addCriterion("bathroom not between", value1, value2, "bathroom");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIsNull() {
            addCriterion("airConditioning is null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIsNotNull() {
            addCriterion("airConditioning is not null");
            return (Criteria) this;
        }

        public Criteria andAirConditioningEqualTo(Integer value) {
            addCriterion("airConditioning =", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotEqualTo(Integer value) {
            addCriterion("airConditioning <>", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningGreaterThan(Integer value) {
            addCriterion("airConditioning >", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningGreaterThanOrEqualTo(Integer value) {
            addCriterion("airConditioning >=", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningLessThan(Integer value) {
            addCriterion("airConditioning <", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningLessThanOrEqualTo(Integer value) {
            addCriterion("airConditioning <=", value, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningIn(List<Integer> values) {
            addCriterion("airConditioning in", values, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotIn(List<Integer> values) {
            addCriterion("airConditioning not in", values, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningBetween(Integer value1, Integer value2) {
            addCriterion("airConditioning between", value1, value2, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andAirConditioningNotBetween(Integer value1, Integer value2) {
            addCriterion("airConditioning not between", value1, value2, "airConditioning");
            return (Criteria) this;
        }

        public Criteria andTVIsNull() {
            addCriterion("TV is null");
            return (Criteria) this;
        }

        public Criteria andTVIsNotNull() {
            addCriterion("TV is not null");
            return (Criteria) this;
        }

        public Criteria andTVEqualTo(Integer value) {
            addCriterion("TV =", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotEqualTo(Integer value) {
            addCriterion("TV <>", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVGreaterThan(Integer value) {
            addCriterion("TV >", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVGreaterThanOrEqualTo(Integer value) {
            addCriterion("TV >=", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVLessThan(Integer value) {
            addCriterion("TV <", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVLessThanOrEqualTo(Integer value) {
            addCriterion("TV <=", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVIn(List<Integer> values) {
            addCriterion("TV in", values, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotIn(List<Integer> values) {
            addCriterion("TV not in", values, "TV");
            return (Criteria) this;
        }

        public Criteria andTVBetween(Integer value1, Integer value2) {
            addCriterion("TV between", value1, value2, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotBetween(Integer value1, Integer value2) {
            addCriterion("TV not between", value1, value2, "TV");
            return (Criteria) this;
        }

        public Criteria andRouterIsNull() {
            addCriterion("router is null");
            return (Criteria) this;
        }

        public Criteria andRouterIsNotNull() {
            addCriterion("router is not null");
            return (Criteria) this;
        }

        public Criteria andRouterEqualTo(Integer value) {
            addCriterion("router =", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotEqualTo(Integer value) {
            addCriterion("router <>", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThan(Integer value) {
            addCriterion("router >", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThanOrEqualTo(Integer value) {
            addCriterion("router >=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThan(Integer value) {
            addCriterion("router <", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThanOrEqualTo(Integer value) {
            addCriterion("router <=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterIn(List<Integer> values) {
            addCriterion("router in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotIn(List<Integer> values) {
            addCriterion("router not in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterBetween(Integer value1, Integer value2) {
            addCriterion("router between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotBetween(Integer value1, Integer value2) {
            addCriterion("router not between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andSmartLockIsNull() {
            addCriterion("smartLock is null");
            return (Criteria) this;
        }

        public Criteria andSmartLockIsNotNull() {
            addCriterion("smartLock is not null");
            return (Criteria) this;
        }

        public Criteria andSmartLockEqualTo(Integer value) {
            addCriterion("smartLock =", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockNotEqualTo(Integer value) {
            addCriterion("smartLock <>", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockGreaterThan(Integer value) {
            addCriterion("smartLock >", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockGreaterThanOrEqualTo(Integer value) {
            addCriterion("smartLock >=", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockLessThan(Integer value) {
            addCriterion("smartLock <", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockLessThanOrEqualTo(Integer value) {
            addCriterion("smartLock <=", value, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockIn(List<Integer> values) {
            addCriterion("smartLock in", values, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockNotIn(List<Integer> values) {
            addCriterion("smartLock not in", values, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockBetween(Integer value1, Integer value2) {
            addCriterion("smartLock between", value1, value2, "smartLock");
            return (Criteria) this;
        }

        public Criteria andSmartLockNotBetween(Integer value1, Integer value2) {
            addCriterion("smartLock not between", value1, value2, "smartLock");
            return (Criteria) this;
        }

        public Criteria andRangeHoodIsNull() {
            addCriterion("rangeHood is null");
            return (Criteria) this;
        }

        public Criteria andRangeHoodIsNotNull() {
            addCriterion("rangeHood is not null");
            return (Criteria) this;
        }

        public Criteria andRangeHoodEqualTo(Integer value) {
            addCriterion("rangeHood =", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodNotEqualTo(Integer value) {
            addCriterion("rangeHood <>", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodGreaterThan(Integer value) {
            addCriterion("rangeHood >", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("rangeHood >=", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodLessThan(Integer value) {
            addCriterion("rangeHood <", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodLessThanOrEqualTo(Integer value) {
            addCriterion("rangeHood <=", value, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodIn(List<Integer> values) {
            addCriterion("rangeHood in", values, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodNotIn(List<Integer> values) {
            addCriterion("rangeHood not in", values, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodBetween(Integer value1, Integer value2) {
            addCriterion("rangeHood between", value1, value2, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRangeHoodNotBetween(Integer value1, Integer value2) {
            addCriterion("rangeHood not between", value1, value2, "rangeHood");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIsNull() {
            addCriterion("refrigerator is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIsNotNull() {
            addCriterion("refrigerator is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorEqualTo(Integer value) {
            addCriterion("refrigerator =", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotEqualTo(Integer value) {
            addCriterion("refrigerator <>", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorGreaterThan(Integer value) {
            addCriterion("refrigerator >", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorGreaterThanOrEqualTo(Integer value) {
            addCriterion("refrigerator >=", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorLessThan(Integer value) {
            addCriterion("refrigerator <", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorLessThanOrEqualTo(Integer value) {
            addCriterion("refrigerator <=", value, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorIn(List<Integer> values) {
            addCriterion("refrigerator in", values, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotIn(List<Integer> values) {
            addCriterion("refrigerator not in", values, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorBetween(Integer value1, Integer value2) {
            addCriterion("refrigerator between", value1, value2, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorNotBetween(Integer value1, Integer value2) {
            addCriterion("refrigerator not between", value1, value2, "refrigerator");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenIsNull() {
            addCriterion("microwaveOven is null");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenIsNotNull() {
            addCriterion("microwaveOven is not null");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenEqualTo(Integer value) {
            addCriterion("microwaveOven =", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenNotEqualTo(Integer value) {
            addCriterion("microwaveOven <>", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenGreaterThan(Integer value) {
            addCriterion("microwaveOven >", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenGreaterThanOrEqualTo(Integer value) {
            addCriterion("microwaveOven >=", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenLessThan(Integer value) {
            addCriterion("microwaveOven <", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenLessThanOrEqualTo(Integer value) {
            addCriterion("microwaveOven <=", value, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenIn(List<Integer> values) {
            addCriterion("microwaveOven in", values, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenNotIn(List<Integer> values) {
            addCriterion("microwaveOven not in", values, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenBetween(Integer value1, Integer value2) {
            addCriterion("microwaveOven between", value1, value2, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andMicrowaveOvenNotBetween(Integer value1, Integer value2) {
            addCriterion("microwaveOven not between", value1, value2, "microwaveOven");
            return (Criteria) this;
        }

        public Criteria andYubaIsNull() {
            addCriterion("yuba is null");
            return (Criteria) this;
        }

        public Criteria andYubaIsNotNull() {
            addCriterion("yuba is not null");
            return (Criteria) this;
        }

        public Criteria andYubaEqualTo(Integer value) {
            addCriterion("yuba =", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaNotEqualTo(Integer value) {
            addCriterion("yuba <>", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaGreaterThan(Integer value) {
            addCriterion("yuba >", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaGreaterThanOrEqualTo(Integer value) {
            addCriterion("yuba >=", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaLessThan(Integer value) {
            addCriterion("yuba <", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaLessThanOrEqualTo(Integer value) {
            addCriterion("yuba <=", value, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaIn(List<Integer> values) {
            addCriterion("yuba in", values, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaNotIn(List<Integer> values) {
            addCriterion("yuba not in", values, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaBetween(Integer value1, Integer value2) {
            addCriterion("yuba between", value1, value2, "yuba");
            return (Criteria) this;
        }

        public Criteria andYubaNotBetween(Integer value1, Integer value2) {
            addCriterion("yuba not between", value1, value2, "yuba");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIsNull() {
            addCriterion("washingMachine is null");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIsNotNull() {
            addCriterion("washingMachine is not null");
            return (Criteria) this;
        }

        public Criteria andWashingMachineEqualTo(Integer value) {
            addCriterion("washingMachine =", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotEqualTo(Integer value) {
            addCriterion("washingMachine <>", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineGreaterThan(Integer value) {
            addCriterion("washingMachine >", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineGreaterThanOrEqualTo(Integer value) {
            addCriterion("washingMachine >=", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineLessThan(Integer value) {
            addCriterion("washingMachine <", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineLessThanOrEqualTo(Integer value) {
            addCriterion("washingMachine <=", value, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineIn(List<Integer> values) {
            addCriterion("washingMachine in", values, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotIn(List<Integer> values) {
            addCriterion("washingMachine not in", values, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineBetween(Integer value1, Integer value2) {
            addCriterion("washingMachine between", value1, value2, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWashingMachineNotBetween(Integer value1, Integer value2) {
            addCriterion("washingMachine not between", value1, value2, "washingMachine");
            return (Criteria) this;
        }

        public Criteria andWardrobeIsNull() {
            addCriterion("wardrobe is null");
            return (Criteria) this;
        }

        public Criteria andWardrobeIsNotNull() {
            addCriterion("wardrobe is not null");
            return (Criteria) this;
        }

        public Criteria andWardrobeEqualTo(Integer value) {
            addCriterion("wardrobe =", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeNotEqualTo(Integer value) {
            addCriterion("wardrobe <>", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeGreaterThan(Integer value) {
            addCriterion("wardrobe >", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wardrobe >=", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeLessThan(Integer value) {
            addCriterion("wardrobe <", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeLessThanOrEqualTo(Integer value) {
            addCriterion("wardrobe <=", value, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeIn(List<Integer> values) {
            addCriterion("wardrobe in", values, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeNotIn(List<Integer> values) {
            addCriterion("wardrobe not in", values, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeBetween(Integer value1, Integer value2) {
            addCriterion("wardrobe between", value1, value2, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andWardrobeNotBetween(Integer value1, Integer value2) {
            addCriterion("wardrobe not between", value1, value2, "wardrobe");
            return (Criteria) this;
        }

        public Criteria andTableIsNull() {
            addCriterion("`table` is null");
            return (Criteria) this;
        }

        public Criteria andTableIsNotNull() {
            addCriterion("`table` is not null");
            return (Criteria) this;
        }

        public Criteria andTableEqualTo(Integer value) {
            addCriterion("`table` =", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotEqualTo(Integer value) {
            addCriterion("`table` <>", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThan(Integer value) {
            addCriterion("`table` >", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableGreaterThanOrEqualTo(Integer value) {
            addCriterion("`table` >=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThan(Integer value) {
            addCriterion("`table` <", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableLessThanOrEqualTo(Integer value) {
            addCriterion("`table` <=", value, "table");
            return (Criteria) this;
        }

        public Criteria andTableIn(List<Integer> values) {
            addCriterion("`table` in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotIn(List<Integer> values) {
            addCriterion("`table` not in", values, "table");
            return (Criteria) this;
        }

        public Criteria andTableBetween(Integer value1, Integer value2) {
            addCriterion("`table` between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andTableNotBetween(Integer value1, Integer value2) {
            addCriterion("`table` not between", value1, value2, "table");
            return (Criteria) this;
        }

        public Criteria andChairIsNull() {
            addCriterion("chair is null");
            return (Criteria) this;
        }

        public Criteria andChairIsNotNull() {
            addCriterion("chair is not null");
            return (Criteria) this;
        }

        public Criteria andChairEqualTo(Integer value) {
            addCriterion("chair =", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairNotEqualTo(Integer value) {
            addCriterion("chair <>", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairGreaterThan(Integer value) {
            addCriterion("chair >", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairGreaterThanOrEqualTo(Integer value) {
            addCriterion("chair >=", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairLessThan(Integer value) {
            addCriterion("chair <", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairLessThanOrEqualTo(Integer value) {
            addCriterion("chair <=", value, "chair");
            return (Criteria) this;
        }

        public Criteria andChairIn(List<Integer> values) {
            addCriterion("chair in", values, "chair");
            return (Criteria) this;
        }

        public Criteria andChairNotIn(List<Integer> values) {
            addCriterion("chair not in", values, "chair");
            return (Criteria) this;
        }

        public Criteria andChairBetween(Integer value1, Integer value2) {
            addCriterion("chair between", value1, value2, "chair");
            return (Criteria) this;
        }

        public Criteria andChairNotBetween(Integer value1, Integer value2) {
            addCriterion("chair not between", value1, value2, "chair");
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