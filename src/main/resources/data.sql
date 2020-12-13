MERGE INTO `role` VALUES (1,'USER');

merge into `product` values 
	(1, 
	'NiceSquirrel', 
	'feeders',
	'Give your squirrel a unicorn head!',
	'/AmazingSquirrel.gif,
	'Unicorn Squirrel Feeder',
	25,
	300);
merge into `product` values 
	(7, 
	'NiceSquirrel', 
	'feeders',
	'A horse for cowsquirrels.',
	'/cowSquirrel.jpg',
	'Squirrel Horse Feeder',
	0035,
	600);
merge into `product` values 
	(3, 
	'Flying Hamburgers!', 
	'feeders',
	'A picnic table for more sophisticated squirrels.',
	'/PicnicSquirrel2.jpg',
	'Picnic Table Feeder',
	35,
	250);
	
merge into `product` values 
	(4, 
	'Flying Hamburgers!', 
	'drone',
	'A high tech drone with a seat for a squirrel pilot.',
	'/squirrel_drone.jpg',
	'Squirrel Drone',
	3500,
	25);
	
	
--USER_ID  	BRAND  	CATEGORY  	DESCRIPTION  	IMAGE_URL  	NAME  	PRICE  	QUANTITY  
