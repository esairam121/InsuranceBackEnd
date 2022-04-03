package com.lti.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lti.entity.CustomerDetails;
import com.lti.entity.InsuranceClaim;
import com.lti.entity.InsurancePolicy;
import com.lti.entity.VehicalDetail;

@Component
public class insuranceDao extends GenericDao {
	

		public boolean isPolicyPresent(int policy_id) {

			return (Long) entityManager.createQuery("select count(c) from InsurancePolicy c where  c.policy_id=: vm")
					.setParameter("vm",policy_id).getSingleResult() == 1 ? true : false;
//			return false;

		}
		public List<InsurancePolicy> fetchAll() {
			String status="Pending";
			return entityManager.createQuery("select a.policy_id,a.policyname,a.paymentDate,a.startDate,a.endDate,a.amount,a.status,a.year from InsurancePolicy a where a.status=: pw ").setParameter("pw", status).getResultList();
				//List<InsuranceClaim> list=q.getResultList();
				//return list;
				
			}
			
}
