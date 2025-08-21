# Final Deployment Steps

## ✅ Completed:
- Updated all API URLs in frontend to use: `https://studnest-backend.onrender.com/api`
- Updated files:
  - `.env` 
  - `src/axios.js`
  - `src/api/authApi.js`
  - `src/pages/admin/AdminDashboard/Subscription.jsx`
  - `src/pages/admin/AdminDashboard/HostelAnalysis.jsx`
  - `src/pages/admin/AdminDashboard/Details.jsx`

## 🚀 Next Steps:

### 1. Update Backend CORS Settings
In your Render dashboard for the backend, add this environment variable:
```
CLIENT_ORIGIN=https://frontend-vercel-tau-one.vercel.app
```

### 2. Deploy Frontend Changes to Vercel
```bash
cd "c:\Users\Heman\OneDrive\Desktop\Project\Frontend"
git add .
git commit -m "Update API URLs to use production backend"
git push origin main
```

Vercel will automatically redeploy your frontend.

### 3. Test the Integration
1. Visit your Vercel frontend URL
2. Try registering/logging in
3. Test admin dashboard features
4. Verify payment functionality

## 🔧 If You Encounter CORS Issues:

1. **Check Backend Logs** in Render dashboard
2. **Verify CLIENT_ORIGIN** environment variable in Render
3. **Ensure Frontend URL** is correct (no trailing slash)

## 📝 Environment Variables Summary:

**Backend (Render):**
```
NODE_ENV=production
MONGO_URI=mongodb+srv://ankitvermacs23:Ankit12345@studnest.necry0j.mongodb.net/StudNest?retryWrites=true&w=majority
JWT_SECRET=studnest_super_secure_token
RAZORPAY_KEY_ID=rzp_test_LYowRhs94oLDDS
RAZORPAY_SECRET=pkkgDHn7mvqBmSvGar1pEpkS
CLOUDINARY_CLOUD_NAME=dov89h5hy
CLOUDINARY_API_KEY=153368547571189
CLOUDINARY_API_SECRET=a3A_t_DxwZhWOk9vPO_k5ElfMmU
CLIENT_ORIGIN=https://frontend-vercel-tau-one.vercel.app
```

**Frontend (Vercel):**
```
VITE_API_BASE_URL=https://studnest-backend.onrender.com/api
VITE_RAZORPAY_KEY_ID=rzp_test_LYowRhs94oLDDS
```

## ✅ Your app should now work end-to-end!