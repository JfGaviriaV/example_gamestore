CREATE TABLE videogames (
  id INT AUTO_INCREMENT PRIMARY KEY,
  videoGameType VARCHAR(255),
  gameName VARCHAR(255),
  create_at DATE
);

INSERT INTO videogames (videoGameType, gameName, create_at) VALUES ('Action-Adventure', 'The Legend of Zelda: Breath of the Wild', '2021-01-15');