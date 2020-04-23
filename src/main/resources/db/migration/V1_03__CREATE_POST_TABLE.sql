CREATE TABLE POST
(
    ID     NUMBER,
    USER_ID NUMBER,
    TITLE        VARCHAR(100),
    CONTENT   VARCHAR(100),
    FOREIGN KEY(USER_ID) REFERENCES USER,

    PRIMARY KEY (ID)
);

