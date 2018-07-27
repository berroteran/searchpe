package io.searchpe.services;

import io.searchpe.model.Company;
import io.searchpe.model.Version;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface VersionService {

    Optional<Version> getLastCompletedVersion();

    List<Version> getVersionsBefore(Date date);

    List<Version> getVersionsByParameters(Map<String, Object> parameters);

    boolean deleteVersion(Version version);

}
