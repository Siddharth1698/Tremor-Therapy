extends CanvasLayer

func _ready():
	$"Control/TextureRect/TextureRect/HBoxContainer/Label".text = str(PlayerLife.life)
	
