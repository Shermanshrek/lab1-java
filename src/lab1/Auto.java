package lab1;

import Exceptions.NoSuchModelNameException;

public class Auto {
    private class Model {
        private String model;
        private double price;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    private String brand;
    private Model[] models;

    private Model find(String modelName) throws NoSuchModelNameException {
        for (Model model : models) {
            if (model.model.equals(modelName)) {
                return model;
            }
        }
        throw new NoSuchModelNameException("Model  " + modelName + " not found");
    }

    public void setNewModelName(String modelName) throws NoSuchModelNameException {
        Model model = find(modelName);
        model.setModel(modelName);
    }

    public String[] getModelNames() {
        String[] modelNames = new String[models.length];
        for (int i = 0; i < models.length; i++) {
            modelNames[i] = models[i].model;
        }
        return modelNames;
    }

    public double getPriceByModelName(String modelName) throws NoSuchModelNameException {
        Model model = find(modelName);
        return model.getPrice();
    }

    public void setPriceByModelName(String modelName, double price) throws NoSuchModelNameException {
        Model model = find(modelName);
        model.setPrice(price);
    }

    public double[] getModelsPrice() {
        double[] modelsPrice = new double[models.length];
        for (int i = 0; i < models.length; i++) {
            modelsPrice[i] = models[i].getPrice();
        }
        return modelsPrice;
    }

    public int getNumModels() {
        return models.length;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Model[] getModels() {
        Model[] returnModels = new Model[models.length];
        System.arraycopy(models, 0, returnModels, 0, models.length);
        return returnModels;
    }

    public void setModels(Model[] models) {
        this.models = models;
    }

    public Auto(String brand, int modelRange) {
        this.brand = brand;
        this.models = new Model[modelRange];
    }

}
