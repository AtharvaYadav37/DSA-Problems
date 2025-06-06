import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    df = animals[animals['weight'] > 100][['name', 'species', 'age', 'weight']]
    df = df.sort_values(by = 'weight', ascending = False)
    return pd.DataFrame(df['name'])