package com.company.records.writting;

import com.company.models.Human;

public interface RecordsWriting {
    void write(Human human);
    void delete(Human human);
    void update(Human human);
    void read(Human human);
}
