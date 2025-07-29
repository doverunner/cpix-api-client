package com.doverunner.cpix;

import com.doverunner.cpix.dto.ContentPackagingInfo;
import com.doverunner.cpix.dto.DrmType;
import com.doverunner.cpix.dto.EncryptionScheme;
import com.doverunner.cpix.dto.TrackType;
import com.doverunner.cpix.exception.CpixClientException;
import java.util.EnumSet;

public interface CpixClient {
	ContentPackagingInfo GetContentKeyInfoFromDoveRunnerKMS(String contentId,
		EnumSet<DrmType> drmTypes, EncryptionScheme encryptionScheme,
		EnumSet<TrackType> trackTypes, long periodIndex) throws CpixClientException;
}
