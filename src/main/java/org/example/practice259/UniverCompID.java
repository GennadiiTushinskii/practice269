package org.example.practice259;

import org.apache.commons.lang3.StringUtils;

public class UniverCompID implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getId(), o1.getId());
    }
}
