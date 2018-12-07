/*

    Adobe AEM Brightcove Connector

    Copyright (C) 2018 Coresecure Inc.

    Authors:    Alessandro Bonfatti
                Yan Kisen
                Pablo Kropilnicki

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    - Additional permission under GNU GPL version 3 section 7
    If you modify this Program, or any covered work, by linking or combining
    it with httpclient 4.1.3, httpcore 4.1.4, httpmine 4.1.3, jsoup 1.7.2,
    squeakysand-commons and squeakysand-osgi (or a modified version of those
    libraries), containing parts covered by the terms of APACHE LICENSE 2.0
    or MIT License, the licensors of this Program grant you additional
    permission to convey the resulting work.

 */
package com.coresecure.brightcove.wrapper.sling;

import java.util.Map;

/**
 * This interface is used to get the certificate per domain. These certificate
 * is used to fix the Fortify scan issue.
 * Ref URL https://vulncat.fortify.com/en/vulncat/java/insecure_ssl_overly_broad_certificate_trust.html
 * @author ubaliy
 * 
 */
public interface CertificateListService {
	/**
	 * This method is used to find the certificate paths for the requested URL.
	 * @return
	 */
	Map<String, String> getCertificatePaths();
	/**
	 * This method is used to find enable / disable the certificate.
	 * @return
	 */
	String getEnableTrustedCertificate();
}
