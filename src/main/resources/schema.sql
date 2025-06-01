CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;


CREATE TABLE  if not exists team
(
    id            BIGINT PRIMARY KEY AUTO_INCREMENT,
    team_name     VARCHAR(255),
    member_limit  INT,
    created_at    TIMESTAMP,
    updated_at    TIMESTAMP,
    created_by_id BIGINT,
    updated_by_id BIGINT

);



CREATE TABLE if not exists user_profile
(
    id            BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_name     VARCHAR(255),
    pin           VARCHAR(255) NOT NULL,
    phone         VARCHAR(255) NOT NULL,
    email         VARCHAR(255) NOT NULL,
    department    VARCHAR(255),
    pass          VARCHAR(255),
    is_admin      BOOLEAN,
    is_manager    BOOLEAN,
    status        VARCHAR(50),
    joining_date  TIMESTAMP,
    created_at    TIMESTAMP,
    updated_at    TIMESTAMP,
    team_id       BIGINT,
    created_by_id BIGINT,
    updated_by_id BIGINT,

    CONSTRAINT fk_team FOREIGN KEY (team_id) REFERENCES team (id)
);


CREATE TABLE if not exists deposit
(
    id                      BIGINT PRIMARY KEY AUTO_INCREMENT,
    deposited_amount        DOUBLE,
    deposited_date          TIMESTAMP,
    created_at              TIMESTAMP,
    updated_at              TIMESTAMP,
    user_id                 BIGINT,
    created_by_id           BIGINT,
    updated_by_id           BIGINT,

    CONSTRAINT fk_deposit_user FOREIGN KEY (user_id) REFERENCES user_profile (id),
    CONSTRAINT fk_deposit_created_by FOREIGN KEY (created_by_id) REFERENCES user_profile (id),
    CONSTRAINT fk_deposit_updated_by FOREIGN KEY (updated_by_id) REFERENCES user_profile (id)
);


CREATE TABLE if not exists consumer
(
    id            BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id       BIGINT,
    spent_amount  DOUBLE,
    spent_date    TIMESTAMP,
    food_name     VARCHAR(255),
    created_at    TIMESTAMP,
    updated_at    TIMESTAMP,
    created_by_id BIGINT,
    updated_by_id BIGINT,

    CONSTRAINT fk_consumer_user FOREIGN KEY (user_id) REFERENCES user_profile (id),
    CONSTRAINT fk_consumer_created_by FOREIGN KEY (created_by_id) REFERENCES user_profile (id),
    CONSTRAINT fk_consumer_updated_by FOREIGN KEY (updated_by_id) REFERENCES user_profile (id)
);



