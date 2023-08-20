setImageType('BRIGHTFIELD_H_DAB');
setColorDeconvolutionStains('{"Name" : "PSR", "Stain 1" : "Hematoxylin", "Values 1" : "0.21327 0.79026 0.57447", "Stain 2" : "DAB", "Values 2" : "0.22107 0.39824 0.89024", "Background" : " 235 233 236"}');
createAnnotationsFromPixelClassifier("Tissue Detection", 1.0E7, 0.0, "SPLIT")
selectAnnotations()
createAnnotationsFromPixelClassifier("Fibrosis_Epicardium", 10E5, 0.0, "SPLIT", "INCLUDE_IGNORED")
selectObjectsByClassification("Ignore*","Tissue Region")
clearSelectedObjects()
selectObjectsByClassification("Region*")
runPlugin('qupath.lib.plugins.objects.SmoothFeaturesPlugin', '{"fwhmMicrons":25.0,"smoothWithinClasses":true}')
addPixelClassifierMeasurements("Collagen_Epicardium", "Collagen_Epicardium")
