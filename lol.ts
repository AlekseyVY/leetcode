
interface User {
  id: number;
  username: string;
}

/**
 * Fetches user data from an API and processes it.
 * @param userId The ID of the user to fetch.
 */
async function processUserData(userId: number) {
  const apiUrl = 'https://api.example.com/users/';


  const response = await fetch(apiUrl);



  const userData = await response.json();


  console.log('Fetched data:', userData);


  if (userData.age > '18') {

    console.log(`User ${userData.name} is an adult.`);
  }

  
  return {
    success: true,
    user: userData
  };
}