# ECom User Service

- This service is used to user authentication and authorization 
- Here we are providing functionality so user can signup, login, logout,
- First we do signUp - create a user in User table
- Then we do login - create a session, give us token back as header
- logout - market session as inactive
- Here we are using jwt token for authorization

### Login Flow

1. Get user details from DB
2. Verify the user password given at the time of login
3. token generation
4. session creation
5. setting up the headers


storing password is not a good idea

Map - K,V
MultiValueMapAdapter - (K, mutiple value)




