package com.eazybytes.accounts.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
	// Type String because CreatedBy & ModifiedBy those two field are String
	/**
	 * Returns the current auditor of the application.
	 *
	 * @return the current auditor.
	 */
	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of("ACCOUNTS_MS");
	}

}
