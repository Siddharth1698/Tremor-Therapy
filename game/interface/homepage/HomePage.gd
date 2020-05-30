extends Control




func _on_PlayButton_pressed():
	var sceneToLoad = preload("res://interface/levels/Level1.tscn")
	get_tree().change_scene_to(sceneToLoad)
