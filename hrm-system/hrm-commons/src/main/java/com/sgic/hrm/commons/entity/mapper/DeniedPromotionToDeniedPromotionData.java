package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DeniedPromotionData;
import com.sgic.hrm.commons.entity.DeniedPromotion;

public class DeniedPromotionToDeniedPromotionData {

	public static DeniedPromotionData mapToDeniedPromotionData(DeniedPromotion deniedPromotion) {
		DeniedPromotionData deniedPromotionData = new DeniedPromotionData();
		if (deniedPromotion != null) {
			deniedPromotionData.setId(deniedPromotion.getId());
			deniedPromotionData.setRequsetId(deniedPromotion.getRequsetId());
			deniedPromotionData.setDesignationId(deniedPromotion.getDesignationId());
			deniedPromotionData.setDeniedDate(deniedPromotion.getDeniedDate());
			deniedPromotionData.setDeniedRemark(deniedPromotion.getDeniedRemark());
			deniedPromotionData.setDeniedBy(deniedPromotion.getDeniedBy());
			deniedPromotionData.setPosition(deniedPromotion.getPosition());

		}
		return deniedPromotionData;
	}

	public static List<DeniedPromotionData> mapToDeniedPromotionDataList(List<DeniedPromotion> deniedPromotionList) {
		List<DeniedPromotionData> deniedPromotionDataList = new ArrayList<DeniedPromotionData>();

		if (deniedPromotionDataList != null) {
			for (DeniedPromotion deniedPromotion : deniedPromotionList) {
				deniedPromotionDataList.add(mapToDeniedPromotionData(deniedPromotion));
			}
		}
		return deniedPromotionDataList;
	}

}
