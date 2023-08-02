package de.ait.hw_db.repositories.impl;

import de.ait.hw_db.models.Event;
import de.ait.hw_db.repositories.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class EventsRepositoryJdbcTemplateImpl implements EventsRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from events;";

    private final JdbcTemplate jdbcTemplate;
    @Override
    public List<Event> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, (rs, rowNum) -> Event.builder()
                .id(rs.getLong("id"))
                .description(rs.getString("description"))
                .title(rs.getString("title"))
                .build());
    }
}
