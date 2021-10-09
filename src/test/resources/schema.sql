CREATE TABLE team_table(
team_id BIGINT PRIMARY KEY,
team_name VARCHAR(50) NOT NULL,
establishment_year INT NOT NULL
);

CREATE TABLE player_table(
user_id UUID PRIMARY KEY,
player_name VARCHAR(50) NOT NULL,
player_surname VARCHAR(50) NOT NULL,
player_goals INT DEFAULT 0,
team_id BIGINT NOT NULL,
FOREIGN KEY (team_id) REFERENCES team_table(team_id) ON DELETE SET NULL
);



INSERT INTO team_table
VALUES ('1', 'Victoria Smroków', '2001');

INSERT INTO player_table
VALUES ('a46f1396-0d65-11ec-82a8-0242ac130003', 'Grzegorz', 'Jamrozowicz','6','1');

INSERT INTO player_table
VALUES ('c900b476-0d65-11ec-82a8-0242ac130003', 'Grzegorz', 'Kociński','1','1');

INSERT INTO player_table
VALUES ('e796e130-0d65-11ec-82a8-0242ac130003', 'Wojciech', 'Simba','0','1');
